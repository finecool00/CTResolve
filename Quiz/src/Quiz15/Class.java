package Quiz15;

import java.util.Arrays;

public class Class implements IBag {
	private String[] ibag = new String[100];
	private int index;

	@Override
	public void insert(String item) {
		ibag[index]= item;
		index++;		
	}

	@Override
	public void print() {
		//출력 - 배열안에 개수만큼 출력

		for(int i =0; i<index; i++) {
			System.out.print(ibag[i] + " ");
			
			}
		}

	

	@Override
	public int search(String item) {
		//검색 - 값이 있다면 index를 return, 없다면 -1을 리턴(가장먼저 검색된 item순서 반환)
		for(int i = 0; i<index; i++) {
			if(ibag[i].equals(item)) {
				return i;
			}
		}return -1;

	}

	@Override
	public boolean delete(String item) {
		//삭제 - 배열의 요소를 삭제(가장먼저 찾게된 item하나만 삭제)
		
		for(int i =0; i<index; i++) {
			if(ibag[i].equals(item)) {
				for(int j=i; j<index-1; j++) {
					ibag[j] = ibag[j+1];
				}
				ibag[index-1]=null;
				index--;
				return true;
				
			}
		}
		return false;
	}

}
