package components;

import java.util.ArrayList;

import javax.imageio.stream.ImageInputStream;
import javax.swing.JPanel;

import panels.GamePanel;


// �� ��� ����
public class GunMonster extends MonsterThread{ //������ ���͸� ���
	public static ArrayList<Shot> shotList = new ArrayList<Shot>();
	private GamePanel mainPanel;

	public GunMonster(int x, int y, int hp, String Image, Player player) {
		super(x, y, hp, Image, player);
		shot();
		
	}

	public ArrayList<Shot> getShotList() {
		return shotList;
	}

	public void setShotList(ArrayList<Shot> shotList) {
		this.shotList = shotList;
	}

	@Override
	public void run() {
		super.run();
		
	}
	
	public void shot() {
		new Thread(new Runnable() {

			@Override
			public void run() {
				while(getImage() != null) {
					shotList.add(new Shot(getX()+50, getY()+15, 2));
					try {
						
						Thread.sleep(2000); //2�ʿ� �ѹ� ��� ����
						
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				}
				
			}
			
		}).start();
	}	
	
}