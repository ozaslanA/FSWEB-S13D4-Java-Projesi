package com.workintech.model;


public class Point {  //x ve y adında iki tane özel (private) tamsayı (int) değişkeni bulunmaktadır. Bu değişkenler, bir noktanın x ve y koordinatlarını temsil eder. Bu değişkenlere sadece bu sınıf içerisinden erişilebilir.
    private int x; //public Point(int x, int y) : Bu, sınıfın yapıcı metodudur. Bir Point nesnesi oluşturulduğunda, bu constructor çağrılır ve x ve y değerleri bu noktanın koordinatları olarak atanır.
    private int y;

    public Point(int x,int y) {
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance(){
        return Math.sqrt(Math.pow(this.getX()-0,2) + Math.pow(this.getY()-0,2));
       }
    public double distance(int a, int b ){
        return Math.sqrt(Math.pow(this.x-a,2) + Math.pow(this.y-b,2));
            }
            public double distance (Point p ){
        if(p ==null){
            p=new Point(0,0);
        }
        return distance();
                }
            }
