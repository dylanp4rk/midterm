/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm Exam
 * @author srinivsi
 */
enum Numbers {
    _0, _1, _2, _3;
}

public class StausUser 
{
   public void statusDetail(String code)
{
switch(code.toUpperCase())
        {
        case "0": System.out.println("REJECTED");
        break;
        case "1": System.out.println("PENDING");
        break;
        case "2":
        System.out.println("PROCESSING");
        break;
        case "3": 
            System.out.println("APPROVED");
        break;
        default:
         System.out.println("NOT VALID CODE");
        break;
        }
}
 
}
