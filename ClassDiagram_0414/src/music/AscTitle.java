package music;

import java.util.Comparator;

public class AscTitle implements Comparator<Music>{

	@Override
	public int compare(Music o1, Music o2) {
		if (o1.getTitle() == o2.getTitle()){
			return o1.getSinger().compareTo(o2.getSinger());
		}else 
		return o1.getTitle().compareTo(o2.getTitle());
	}
}
