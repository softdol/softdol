package gui.quiz.hangman;

import java.util.ArrayList;

public class WordList {
	
	private ArrayList<Word> wordList = new ArrayList<Word>();
	private Word answer;
	
	public WordList() {
		wordList.add(new Word("apple", "Fruit"));
		wordList.add(new Word("banana", "Fruit"));
		wordList.add(new Word("mango", "Fruit"));
		wordList.add(new Word("melon", "Fruit"));
		wordList.add(new Word("grape", "Fruit"));
		wordList.add(new Word("pear", "Fruit"));
		
		wordList.add(new Word("bear", "Animal"));
		wordList.add(new Word("Cheetah", "Animal"));
		wordList.add(new Word("dog", "Animal"));
		wordList.add(new Word("giraffe", "Animal"));
		wordList.add(new Word("hippo", "Animal"));
		
//		wordList.add("apple");
//		wordList.add("banana");
//		wordList.add("mango");
//		wordList.add("melon");
//		wordList.add("grape");
//		wordList.add("pear");
	}
	
	public char[] getWord() {
		answer = wordList.get((int)(Math.random() * wordList.size()));
		return answer.getWord().toUpperCase().toCharArray();
	}

	public Word getAnswer() {
		return answer;
	}
}


