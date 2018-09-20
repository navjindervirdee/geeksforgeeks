/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for C++
/*The function should return a string denoting the 
order of the words in the Alien Dictionary */
class Alphabet{
    public :
    int index;
    char c;
    vector<int> edges;
    bool visited;
    int prev;
    int post;
    
    Alphabet(char ch, int idx){
        index = idx;
        c = ch;
        visited = false;
        prev = -1;
        post = -1;
    }
};

int explore(vector<Alphabet>& graph, Alphabet a, int clk){
    a.visited = true;
    a.prev = clk;
    graph[a.index] = a;
    clk++;
    
    vector<int> edg = a.edges;
    for(int i=0;i<edg.size();i++){
        Alphabet temp = graph[edg[i]];
        if(temp.visited==1){
            continue;
        }
        clk = explore(graph,temp,clk);
    }
    
    a.post = clk;
    clk++;
    graph[a.index] = a;
    return clk;
}

void dfs(vector<Alphabet>& graph, int clk){
    for(int i=0;i<graph.size();i++){
        Alphabet a = graph[i];
        if(a.visited==1){
            continue;
        }
        clk = explore(graph,a,clk);
    }
}



string printOrder(string dict[], int N, int k){
    vector<Alphabet> graph;
    int index[26];
    
    for(int i=0;i<26;i++){
        index[i] = -1;
    }
    
    
    int it = 0;
    for(int i=0;i<N-1;i++){
        int n1 = dict[i].length();
        int n2 = dict[i+1].length();
        
        char array1[n1+1];
        char array2[n2+1];
        
        strcpy(array1,dict[i].c_str());
        strcpy(array2,dict[i+1].c_str());
        
        int j=0;
        int k=0;
        
        while(j<n1 && k<n2){
            if(array1[j]!=array2[k]){
                int val1 = array1[j]-'a';
                int index1 = index[val1];
                if(index1==-1){
                    Alphabet alpha1(array1[j],graph.size());
                    index[val1] = graph.size();
                    graph.push_back(alpha1);
                    it++;
                }
                int val2 = array2[k]-'a';
                int index2 = index[val2];
                if(index2==-1){
                    Alphabet alpha2(array2[k],graph.size());
                    index[val2] = graph.size();
                    graph.push_back(alpha2);
                    it++;
                }
                
                graph[index[val1]].edges.push_back(index[val2]);
                break;
            }
            j++;
            k++;
        }
     }
     
     
     dfs(graph,0);
     
     sort(graph.begin(), graph.end(), [](const Alphabet & lhs, const Alphabet & rhs){
            return lhs.post > rhs.post;
     });
     
     string result;
     
     for(int i=0;i<graph.size();i++){
         Alphabet a = graph[i];
         result += a.c;
     }
    return result;
}