type personList = {
  name: {
    fn: string;
    ln: string;
  }[]; //array of objects
};

export const Person = (props: personList) => {
  return (
    <div>
      {props.name.map((items) => (
        <div>
          {items.fn} and {items.ln}
        </div>
      ))}
    </div>
  );
};
