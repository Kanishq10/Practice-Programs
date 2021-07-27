
import tkinter as tkinter
from tkinter import *

def add():
    x=(e1.get())
    y=(e2.get())
    e3.insert(0,x+y)
    e1.delete(0,END)
    e2.delete(0,END)
win=Tk()
win.geometry("300x400+50+50")
l1=Label(win,text="Enter the first no")
l1.pack(side=LEFT)
e1=Entry(win,width=100)
e1.pack(side=LEFT)
l2=Label(win,text="Enter the first no")
l2.pack(side=LEFT)
e2=Entry(win,width=100)
e2.pack()
e3=Entry(win,width=100)
e3.pack()
b1=Button(win,text="Add",width=30,command=add)
b1.pack()
win.mainloop()