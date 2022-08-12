package find_value_in_array;

import java.util.Scanner;

public class Find {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] students = {"Lê Bá Lộc", "Trần Hải Bình", "Lý Thanh Tùng", "Nguyễn Hà", "Nguyễn Minh Hiếu"};
        System.out.print("Nhập tên sinh viên: ");
        String input_name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++){
            if (students[i].equals(input_name)){
                System.out.printf("Vị trí của sinh viên %s ở vị trí %d", students[i],i+1);
                isExist = true;
                break;
            }
        } if (!isExist)
            System.out.printf("Sinh viên %s không có trong danh sách.",input_name);
    }
}
