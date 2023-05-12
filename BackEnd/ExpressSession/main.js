const express = require('express');
const bodyParser = require('body-parser');
const session = require('express-session');
const fs = require('fs');

const app = express();

app.listen(3000, () => {
  console.log('Server started...');
}).on('error', (err) => {
  console.log('Unable to start server:', err);
});

fs.writeFile('users.txt', '[]', (err) => {
  if (err) throw err;
});

app.use(session({
  secret: 'my-secret-key',
  resave: false,
  saveUninitialized: true
}));

app.use(bodyParser.urlencoded({ extended: true }));

app.post('/signup', (req, res) => {
  const user = {
    name: req.body.name,
    username: req.body.username,
    password: req.body.password
  };

  fs.readFile('users.txt', (err, data) => {
    if (err) throw err;

    const users = JSON.parse(data);
    users.push(user);

    fs.writeFile('users.txt', JSON.stringify(users), (err) => {
      if (err) throw err;

      res.send('User signed up successfully');
    });
  });
});

app.post('/login', (req, res) => {
  const username = req.body.username;
  const password = req.body.password;

  fs.readFile('users.txt', (err, data) => {
    if (err) throw err;

    const users = JSON.parse(data);
    const user = users.find(u => u.username === username);

    if (!user || user.password !== password) {
      res.send('Invalid username or password');
    } else {
      req.session.username = username;
      res.redirect('/home');
    }
  });
});

app.get('/home', (req, res) => {
  const username = req.session.username;

  if (!username) {
    res.redirect('/login');
  } else {
    res.send(`
      <h1>Welcome ${username}</h1>
      <form action="/logout" method="POST">
        <input type="submit" value="Logout">
      </form>
    `);
  }
});


app.post('/logout', (req, res) => {
  req.session.destroy(() => {
    res.redirect('/login');
  });
});


const loginPage = `
  <form action="/login" method="POST">
    <label for="username">Username:</label>
    <input type="text" id="username" name="username"><br>

    <label for="password">Password:</label>
    <input type="password" id="password" name="password"><br>

    <input type="submit" value="Submit">
  </form>
`;

const signupPage = `
  <form action="/signup" method="POST">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name"><br>

    <label for="username">Username:</label>
    <input type="text" id="username" name="username"><br>

    <label for="password">Password:</label>
    <input type="password" id="password" name="password"><br>

    <input type="submit" value="Submit">
  </form>
`;

app.get('/signup', (req, res) => {
  res.send(signupPage);
});

app.get('/login', (req, res) => {
  res.send(loginPage);
});