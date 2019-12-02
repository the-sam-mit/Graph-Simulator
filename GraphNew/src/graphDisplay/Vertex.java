/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphDisplay;

/**
 *
 * @author sam_mit
 */
public class Vertex implements Comparable<Vertex>{
    String name;
    int x, y;
    Double distance;
    Boolean visited;
    Edge parent;
    
    public Vertex(String name, int x, int y){
        this.name = name;
        this.x = x;
        this.y = y;
        this.distance = Double.MAX_VALUE;
         this.visited = false;
         this.parent = null;
    }
    int getX(){
        return x;
    }
    int getY(){
        return y;
    }
    String getName(){
        return name;
    }
    void setName(String name){
        this.name = name;
    }
    void setX(int x){
        this.x = x;
    }
    void setY(int y){
        this.y = y;
    }
    Double getDistance(){
        return distance;
    }
    Boolean getVisited(){
        return visited;
    }
    Edge getParent(){
        return parent;
    }
    void setDistance(Double distance){
        this.distance = distance;
    }
    void setVisited(Boolean visited){
        this.visited = visited;
    }
    void set(){
        this.parent=null;
    }
    void setParent(Edge i){
        this.parent = i;
    }
    public String toString() {
        return this.name;
    }
    @Override
    public int compareTo(Vertex next) {
        return Double.compare(this.distance, next.getDistance());
    }
}
