import java.util.*;
class Playlist{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the playlist size:");
		int n=sc.nextInt();
		ArrayList<String> playlist=new ArrayList<>();
		for(int i=0;i<=n;i++){
			System.out.println("Enter the "+i+" st song:");
			String song=sc.nextLine();
			playlist.add(song);
		}
		System.out.println("Playlist:"+playlist);
		String var=playlist.remove(1); 
		System.out.println("Removed song:"+var);
		System.out.println("Playlist:"+playlist);
        String ex=playlist.get(1); 
		System.out.println("Searched song:"+ex);
		System.out.println("Playlist:"+playlist);
        playlist.contains("b"); 
		System.out.println("Playlist:"+playlist);

	} 
}