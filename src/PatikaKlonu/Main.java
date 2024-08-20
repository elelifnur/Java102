package PatikaKlonu;

import PatikaKlonu.Helper.Helper;
import PatikaKlonu.Model.Operator;
import PatikaKlonu.View.OperatorGUI;

public class Main {
    public static void main(String[] args){
        Helper.setLayout();
        Operator op = new Operator();
        op.setId(1);
        op.setName("Elif Nur Akın");
        op.setPassword("1234");
        op.setType("operator");
        op.setUname("elif");
        OperatorGUI opGUI = new OperatorGUI(op);
    }
}
