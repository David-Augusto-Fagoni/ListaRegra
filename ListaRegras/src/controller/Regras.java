package controller;

import modelInt.IListaInt;

public class Regras {
	public void Conjunto(IListaInt lista, int[] VT) throws Exception{
		int TamV = VT.length;
		for(int J=0;J<TamV;J++) {
			if (!Repitido(VT[J],lista)) {
				lista.addLast(VT[J]);
			}else if(VT[J]%2==0) {
				lista.add(2, VT[J]);
			}else if(VT[J]%2!=0) {
				lista.add(1, VT[J]);
			}
		}
	}
	public boolean Repitido(int VT, IListaInt lista) throws Exception {
		int tm = lista.size();
		for(int J=0;J<tm;J++) {
			if(lista.get(J)== VT) {
				return true;
			}
		}
		return false;
		
	}
}
