package com.shaka;

public class Truck extends Transport{
    public Truck(){

    }
    private boolean isLoaded;
//    public Truck(float speed,int weight,String color,byte[] coordinates,boolean isLoaded){
//        super(speed,weight,color,coordinates);
//        this.isLoaded = isLoaded;
//        System.out.println(getValues());
//    }
    public Truck(float speed,int weight,String color,boolean isLoaded){
        super(speed,weight,color);
        this.isLoaded = isLoaded;
        System.out.println(getValues());
   }

    public void setValues(float speed,int weight,String color,byte[] coordinates,boolean isLoaded){
        super.speed = speed;
        super.weight = weight;
        super.color = color;
        super.coordinates = coordinates;
        this.isLoaded = isLoaded;
    }
    public void setLoaded(boolean isLoaded){
        this.isLoaded = isLoaded;
    }
    public String getLoaded(){
        if(isLoaded)
            return "Truck is loaded";
        else
            return "Truck is NOT loaded";
    }
    @Override
    public  String getValues(){
        String info = super.getValues();
        return info + "\n" +getLoaded();
    }
}
