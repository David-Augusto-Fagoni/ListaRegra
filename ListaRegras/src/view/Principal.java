package view;

import controller.Regras;
import modelInt.IListaInt;
import modelInt.ListaInt;

public class Principal {

	public static void main(String[] args) {
		int[] VT = {3,3,9,6,9,8,9,5,7,10,4,8,10,8};
		IListaInt Lista = new ListaInt();
		Regras R = new Regras();
		Lista.addFirst(1);
		try {
			Lista.addLast(2);
			Lista.addLast(6);
			Lista.addLast(7);
			Lista.addLast(8);
			R.Conjunto(Lista,VT);
		} catch (Exception e) {
			e.printStackTrace();
		}
		int tm = Lista.size();
		for(int J=0;J<tm;J++) {
			try {
				System.out.println(Lista.get(J));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
