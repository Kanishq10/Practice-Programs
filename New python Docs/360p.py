import pytube
from pytube import YouTube
yt=pytube.YouTube("https://youtu.be/10L-TSzln1s")
vid=yt.streams.first()
print(yt.views)
print(yt.author)
vid.download()