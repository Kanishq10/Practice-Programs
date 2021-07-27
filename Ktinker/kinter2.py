import tkinter as tk
from tkinter import * 
root=tk.Tk()
root.geometry("300x400+600+200")
root.resizable(height=0,width=0)
for i in range(4):
    root.columnconfigure(i,weight="1")
l1=Label(root,text="Enter your No.",fg="blue")
l1.pack()
l2=Label(root,text="Enter your Name",fg="blue")
l2.pack()
l3=Label(root,text="Enter your No.",fg="blue")
l3.pack()
root.mainloop()