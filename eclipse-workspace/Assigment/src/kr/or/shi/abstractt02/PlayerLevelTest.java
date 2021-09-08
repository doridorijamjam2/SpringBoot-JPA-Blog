package kr.or.shi.abstractt02;

public class PlayerLevelTest {

	public static void main(String[] args) {
		
		Player player = new Player();
		player.play(1);
		
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
		
		
		AdvancesLevel aLevel = new AdvancesLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
	}

}
