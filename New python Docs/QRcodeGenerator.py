import qrcode
data="https://github.com/Kanishq10"   #variable to store data

img=qrcode.make(data)   #converting data to qrcode
print(type(img))

img.save("QR.jpg")   #saving 