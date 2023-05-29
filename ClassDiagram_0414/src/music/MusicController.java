package music;

import java.util.ArrayList;
import java.util.Collections;

public class MusicController {

	ArrayList<Music> list = new ArrayList<>();

	public int addList(Music music) {

		list.add(music);
		return 1;
	}

	public int addAtZero(Music music) {

		list.add(0, music);
		return 1;
	}

	public ArrayList<Music> printAll() {

		for (int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + "번째 정보: " + list.get(i).getSinger() + "-" + list.get(i).getTitle());
		}

		return list;
	}

	public Music searchMusic(String title) {
		Music music = null;
		for (int i = 0; i < list.size(); i++) {
			if (title.equals(list.get(i).getTitle())) {
				music = list.get(i);
			}
		}
		return music;
	}

	public Music removeMusic(String title) {
		Music music = null;
		for (int i = 0; i < list.size(); i++) {
			if (title.equals(list.get(i).getTitle())) {
				music = list.get(i);
				list.remove(i);
			}
		}
		return music;
	}

	public Music setMusic(String title, Music music) {
		for (int i = 0; i < list.size(); i++) {
			if (title.equals(list.get(i).getTitle())) {
				// 수정 먼저 하고
				list.set(i, music);
				return music;
			}
		}
		return null;
	}

	public int ascTitle() {
		Collections.sort(list, new AscTitle());
		return 1;
	}

	public int descSinger() {
		Collections.sort(list, new DescTitle());

		return 1;
	}

}
