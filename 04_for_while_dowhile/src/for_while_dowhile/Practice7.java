package for_while_dowhile;

/*
 * [����7] ������ 
 * 3�� for�� ����ϼ���
 */
public class Practice7 {
    public static void main(String[] args) {
    	for(int enter = 0; enter <= 6; enter+=3) {
    		for(int i = 1; i <= 9; i++) {
    			for(int dan = 2+enter; dan <= 4+enter; dan++) {
    				if(dan > 9) break;
    				System.out.print(dan+" * "+i+" = "+dan*i+"\t");
    			} // for - 2~9��
    			System.out.println();
    		} // for - 1 ~ 9 ���ϱ�
    		System.out.println();
    	} // for - �� �ٲ�
	}
}
