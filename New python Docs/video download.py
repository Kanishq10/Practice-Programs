import pytube
from pytube import YouTube
yt=pytube.YouTube("https://youtu.be/ck2fwbwt7cM")
vid=yt.streams.first() #highest quality
vid.download()

#in one line
YouTube('https://youtu.be/ck2fwbwt7cM').streams.first().download()
