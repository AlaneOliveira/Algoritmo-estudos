#include <iostream>
#include <vector>

using namespace std;

class grafo{
    int V; // cria a variavel para vertices
    vector<vector<int>> list; // cria uma lista para os grafos (armazenar)
    
    public:
        grafo(int V){
            this->V = V; // construtor para V
            list.resize(V); // força/modifica a list a ter o tamanho de V
        }
    void addArestas(int pontoX, int pontoY){ // cria a variavel para armazenar os valores dentro do grafo
        /* 
            A -> B 
            vertices/nos: A,B
            arestas: ->
            
            aqui estamos criando essa seta, nesse caso temos um grafo não direcionado
        */
            
        list[pontoX].push_back(pontoY);// liga o ponto de A a B (cria a seta) = A -> B
        if (pontoX != pontoY) { // verificar se o ponto X e Y são iguais ou não para não precisar repetir
        list[pontoY].push_back(pontoX);
        }
        //list[pontoY].push_back(pontoX); // faz o mesmo sendo o contrario, de ponto B para A = B -> B - não direcionada
        
    }
    void imprimirGrafo(){
        
        /*
            enquanto i for menor que os vertices(V), incremente
        */
        for(int i = 0; i < V; i++){
            cout << "\nO vertice " << i << " eh conectado ao ";
            for(int vizinho : list[i]){
                cout << vizinho << " ";
            }
        }
    }
    void dfs(int atual, vector<bool> &visitado){
        visitado[atual] = true; // se o vertice visitado já estiver marcado, ele é verdadeiro
        
        for(int vizinho : list[atual]){
            if (!visitado[vizinho]) {     // só visita o vizinho se ainda não foi visitado
            dfs(vizinho, visitado);
            }
        }
    }
    void executarDFS(int inicio){
        vector<bool> visitado (V, false);
        dfs(inicio,visitado);
    }
};

int main(){
    /*
    criação de um grafo simples
    */
    
    grafo g(5); // cria um grafo de 0 a 4
    
    g.addArestas(3,3); // chamada de funcao para adicionar as arestas
    g.addArestas(4,1);
    g.addArestas(0,2);
    
    g.imprimirGrafo(); // imprime os grafos
    
    cout << endl;
    g.executarDFS(0); // Executar a partir do vertice 0
    
    return 0;
}