class KC{
public void address(){
System.out.println("Ishan Arcade Thane");
}}

class Borivali extends KC{
public void address(){
System.out.println("Paras Business Center Borivali");
}}

class Panvel extends KC{
public void address(){
System.out.println("Sai Arcade Panvel");
}}

class KCTest{
public static void main(String args[]){
KC b1=new KC();
b1.address();
Borivali b2=new Borivali();
b1.address();
Panvel b3=new Panvel();
b3.address();
}}