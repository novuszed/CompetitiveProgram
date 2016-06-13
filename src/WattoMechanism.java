import java.util.*;
public class WattoMechanism {
static class Trie {
		
		Node root;
		
		static class Node {
			Node next [];
			boolean end;
			
			public Node (){
				next = new Node[3];
				end = false;
			}
		}
		
		public Trie (){
			root = new Node();
		}
		
		public void insert (String s){
			Node current = root;
			for(int i = 0;i < s.length();i++){
				if(current.next[s.charAt(i) - 'a'] == null)
					current.next[s.charAt(i) - 'a'] = new Node();
				current = current.next[s.charAt(i) - 'a'];
			}
			current.end = true;
		}
		
		public boolean search (Node cur,String s,int idx, boolean diff){
			if(idx == s.length()){
				if(cur.end && diff)
					return true;
				return false;
			}
			for(int i = 0;i < 3;i++){
				if(cur.next[i] == null)
					continue;
				if(i == (s.charAt(idx) - 'a')){
					if(search(cur.next[i], s, idx + 1, diff))
						return true;
				}
				else if(!diff){
					if(search(cur.next[i], s, idx + 1, true))
						return true;
				}
			}
			return false;
		}
	}
	/*
	static class TrieNode{
		char c;
		HashMap<Character, TrieNode> children = new HashMap<Character, TrieNode>();
		boolean isLeaf;
		public TrieNode(){
			
		}
		public TrieNode(char c){
			this.c=c;
		}
	}
	private TrieNode root;
	public WattoMechanism(){
		root = new TrieNode();
	}
	public void insert(String word)
	{
		HashMap<Character, TrieNode> children = root.children;
		for(int i=0;i<word.length();i++)
		{
			char c = word.charAt(i);
			TrieNode t;
			if(children.containsKey(c))
				t=children.get(c);
			else
			{
				t = new TrieNode(c);
				children.put(c, t);
			}
			children = t.children;
			if(i==word.length()-1)
			{
				t.isLeaf = true;
			}
		}
		
	}
	public boolean search(String word)
	{
		TrieNode t = searchNode(word);
		if (t!=null && t.isLeaf)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean startsWith(String prefix)
	{
		if (searchNode(prefix)==null)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	   public TrieNode searchNode(String str){
	        Map<Character, TrieNode> children = root.children; 
	        TrieNode t = null;
	        for(int i=0; i<str.length(); i++){
	            char c = str.charAt(i);
	            if(children.containsKey(c)){
	                t = children.get(c);
	                children = t.children;
	            }else{
	                return null;
	            }
	        }
	 
	        return t;
	    }
	   */
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int m =sc.nextInt();
	Trie t = new Trie();
	for(int i=0;i<n;i++)
	{
		t.insert(sc.nextLine());
	}
	for(int i=0;i<m;i++)
	{
		if(t.search(t.root, sc.nextLine(),0,false))
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
	}
}
