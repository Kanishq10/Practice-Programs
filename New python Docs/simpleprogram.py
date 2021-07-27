def stringmaker(str):
    phrase=str.capitalize();
    if str.startswith(("how","why","when","where")):#how why etc are tuples
        return "{}?".format(phrase)
    else:
        return "{}".format(phrase)

phrase=[]
while True:
    str=input("Say something:  ")
    if(str=="/end"):
        break
    phrase.append(stringmaker(str))
    
    
   

print(",".join(phrase))
