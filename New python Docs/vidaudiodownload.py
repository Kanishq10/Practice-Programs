import pytube
from pytube import YouTube
yt=pytube.YouTube("https://youtu.be/10L-TSzln1s")
vid=yt.streams.get_audio_only() #audio only
vid.download("audio")