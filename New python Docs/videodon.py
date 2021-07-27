from pytube import YouTube  
video = YouTube('https://www.youtube.com/watch?v=5Z0rJfT0jdQ&t=5s')  
print(video.title)  
print(video.video_id)  
print(video.description)  
print(video.length)  
print(video.thumbnail_url)  
print(video.views)  
print(video.rating)  
print(video.age_restricted)



video = YouTube('https://www.youtube.com/watch?v=5Z0rJfT0jdQ&t=5s')  
video.streams.all()  
stream = video.streams.all()  
for i in stream:  
    print(i)   
