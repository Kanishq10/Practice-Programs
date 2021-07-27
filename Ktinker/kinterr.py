import tkinter as tk
from tkinter import *
window=Tk()
Message=Label(text="Welcome",foreground="yellow",background="blue")
Message.pack()
Message=Label(text="Welcome",fg="red",bg="black",width="20",height="11")
Message.pack()
e1=Entry(width=50)
e1.pack()
window.mainloop()