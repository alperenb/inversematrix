
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alperen
 */
public class Matrıx{
private static final int column=3;
private static final int row=3;
private static final int matrix[][]= new int[row][column];

 
public void create_Matrıx(){
    Scanner input = new Scanner(System.in);

int matrıxvalue=0;
System.out.println("Write the Matrıx 3x3");
for(int i=0;i<row;i++){
for(int j=0;j<column;j++){
matrıxvalue=input.nextInt();
matrix[i][j]=matrıxvalue;
}}} 

 
 public void display_Matrıx(){
Scanner input = new Scanner(System.in);
for(int i=0;i<row;i++){
System.out.print("|");
for(int j=0;j<column;j++){
System.out.print(matrix[i][j]+" ");
}System.out.print("|");
System.out.println(); 
}} 

   
public int calculate_Determinant(){
int det;
  
det=(matrix[0][0]*matrix[1][1]*matrix[2][2])+(matrix[0][1]*matrix[1][2]*matrix[2][0])+(matrix[0][2]*matrix[1][0]*matrix[2][1])
-(matrix[0][2]*matrix[1][1]*matrix[2][0])-(matrix[0][0]*matrix[1][2]*matrix[2][1])-(matrix[0][1]*matrix[1][0]*matrix[2][2]);
return det;
}

public int[][] inverse_Matrıx(){
int matrıx[][]=matrix;
int detcal= calculate_Determinant();

  if(detcal!=0){
for(int i =0;i<row;i++)
 for(int j=0;j<column;j++){
matrıx[i][j]= ((matrıx[(i+1)%3][(j+1)%3]* matrıx[(i+2)%3][(j+2)%3]) - (matrıx[(i+1)%3][(j+2)%3]+ matrıx[(i+2)%3][(j+1)%3]))/detcal;
}}
 
return matrıx;
}

   public void display_IM(){
int detcal= calculate_Determinant();
if(detcal!=0){ 
int rm[][]=new int[row][column];
rm=inverse_Matrıx();
for(int i=0;i<row;i++){
System.out.print("|");
for(int j=0;j<column;j++){
System.out.print(rm[i][j]+" ");
}System.out.print("|");
System.out.println(); 
   
    }}
   
   else
        System.out.println("Matrix has not reverse because determinant is 0");
   
}
}