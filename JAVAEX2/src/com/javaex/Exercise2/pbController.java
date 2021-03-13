package com.javaex.Exercise2;

import java.util.Scanner;

public class pbController {
	protected void phonebook() {
		pbManager pbm = new pbManager();
		pbView pbv = new pbView();
		
		pbv.viewStart();
		Scanner sc = new Scanner(System.in);
		while (true) {
			pbv.viewMenu();
			switch(sc.nextInt()) {
			case 1:
				pbv.viewList();
				continue;
			case 2:
				pbv.viewAdd();
				pbm.twolistadd2(pbm.twolistadd(sc));
				System.out.println("[등록되었습니다.]\n");
				continue;
			case 3:
				pbv.viewDelete();
				pbm.threeDelete(sc.nextInt());
				System.out.println("[삭제]\n");
				continue;
			case 4:
				pbv.viewSearch();
				pbm.fourSearch(sc.next());
				continue;
			case 5:
				pbv.viewEnd();
				break;
			default:
				pbv.viewErr();
				continue;
			}
			sc.close();
			break;
		}
		
	}

}
