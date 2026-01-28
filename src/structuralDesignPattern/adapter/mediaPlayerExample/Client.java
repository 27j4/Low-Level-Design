import structuralDesignPattern.adapter.mediaPlayerExample.AudioPlayer;

void main(){

     AudioPlayer audioPlayer=
        new structuralDesignPattern.adapter.mediaPlayerExample.AudioPlayer();

    audioPlayer.play("mp3", "song1.mp3");
    audioPlayer.play("mp4", "video1.mp4");
    audioPlayer.play("vlc", "movie1.vlc");
    audioPlayer.play("avi", "documentary1.avi");

}