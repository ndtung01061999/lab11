package test.chuois;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Chuoi {
    private String name;
    private int age;
    private String adress;

    public static void main(String[] args) {
//        Chuoi chuoi = new Chuoi("tung",24, "Ha Noi");
    }
}
