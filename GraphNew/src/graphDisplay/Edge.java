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
public class Edge {
    Vertex source, destination;
    double weight;
    Edge(Vertex source, Vertex destination, double weight){
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }
    Vertex getSource(){
        return source;
    }
    Vertex getDestination(){
        return destination;
    }
    double getWeight(){
        return weight;
    }
    void setWeight(int weight){
        this.weight = weight;
    }
    void setDestination(Vertex destination){
        this.destination = destination;
    }
}
