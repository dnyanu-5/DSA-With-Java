package Strings;

public class shortestpath {
    public static float shortPath(String path){
        int x=0;
        int y=0;
        for(int i=0;i<path.length();i++){
            char dir= path.charAt(i);
            if(dir=='W'){
                x--;
            }else if(dir=='E'){
                x++;
            }else if(dir=='N'){
                y++;
            }else{
                y--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        
        String path = "WNEENENEWNN";
        System.out.println(shortPath(path));
    }
}