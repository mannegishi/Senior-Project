import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.*;

public class Display {

	// fonts
	static Font titleF = new Font("arial", Font.BOLD, 50);
	static Font quizF = new Font("arial", Font.PLAIN, 35);
	static Font textF = new Font("arial", Font.PLAIN, 20);

	static int quizCounter;

	static JFrame f = new JFrame("Dogs");
	// static ImageIcon icon = new ImageIcon(null);
	static JPanel p = new JPanel();
	static Color colr = new Color(160, 187, 229);

	// quiz results
	static int answerSportsDogs = 0;
	static int answerToyDogs = 0;
	static int answerIntelligentDogs = 0;
	static int answerWorkingDogs = 0;
	static int answerFamilyDogs = 0;
	static int answerElegantDogs = 0;
	static int answerEasyDogs = 0;
	static int answerMuttDogs = 0;

	// define new frame
	public static void def() {
		f.setLayout(new BorderLayout());
		p.setLayout(null);
		f.setSize(1400, 900);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		p.setBackground(colr);

	}

	public static void title() {
		def();

		// declarations
		JLabel title = new JLabel("Shelter Dogs For You");
		title.setFont(titleF);

		JButton quizButton = new JButton("Take the quiz");
		JButton mapButton = new JButton("See the map");
		JButton dogsButton = new JButton("See the dogs");
		JButton quitButton = new JButton("Quit");

		f.add(p);

		// placement
		Dimension titleSize = title.getPreferredSize();
		title.setBounds(30, 100, titleSize.width, titleSize.height);
		title.setForeground(Color.DARK_GRAY);
		p.add(title);

		Dimension quizButtonSize = quizButton.getPreferredSize();
		quizButton.setBounds(30, 300, quizButtonSize.width, quizButtonSize.height);
		quizButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clear();
				quizTitleScreen();
			}
		});
		p.add(quizButton);

		Dimension mapButtonSize = mapButton.getPreferredSize();
		mapButton.setBounds(30, 400, mapButtonSize.width, mapButtonSize.height);
		mapButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clear();
				mapScreen();
			}
		});
		p.add(mapButton);

		Dimension dogsButtonSize = dogsButton.getPreferredSize();
		dogsButton.setBounds(30, 500, dogsButtonSize.width, dogsButtonSize.height);
		dogsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clear();
				dogsScreen();
			}
		});
		p.add(dogsButton);

		Dimension quitButtonSize = quitButton.getPreferredSize();
		quitButton.setBounds(30, 600, quitButtonSize.width, quitButtonSize.height);
		quitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clear();
				quit();
			}
		});
		p.add(quitButton);
		
		f.setVisible(true);

	}

	public static void quizTitleScreen() {
		// declarations
		JLabel title = new JLabel("Dog Quiz");
		title.setFont(titleF);

		JLabel descriptionL1 = new JLabel("Here, you will be able to answer questions that reflect");
		JLabel descriptionL2 = new JLabel("on a good choice of dog breed for you. Finish the quiz");
		JLabel descriptionL3 = new JLabel("to find out the best breed for you!");
		descriptionL1.setFont(textF);
		descriptionL2.setFont(textF);
		descriptionL3.setFont(textF);

		JButton quizButton = new JButton("Take the quiz");
		JButton titleButton = new JButton("Back to title");

		// placement
		Dimension titleSize = title.getPreferredSize();
		title.setBounds(592, 100, titleSize.width, titleSize.height);
		title.setForeground(Color.DARK_GRAY);
		p.add(title);

		Dimension descriptionL1Size = descriptionL1.getPreferredSize();
		descriptionL1.setBounds(465, 200, descriptionL1Size.width, descriptionL1Size.height);
		descriptionL1.setForeground(Color.DARK_GRAY);
		System.out.println(descriptionL1Size.width + " d1");
		p.add(descriptionL1);

		Dimension descriptionL2Size = descriptionL2.getPreferredSize();
		descriptionL2.setBounds(462, 230, descriptionL2Size.width, descriptionL2Size.height);
		descriptionL2.setForeground(Color.DARK_GRAY);
		System.out.println(descriptionL2Size.width + " d2");
		p.add(descriptionL2);

		Dimension descriptionL3Size = descriptionL3.getPreferredSize();
		descriptionL3.setBounds(560, 260, descriptionL3Size.width, descriptionL3Size.height);
		descriptionL3.setForeground(Color.DARK_GRAY);
		System.out.println(descriptionL3Size.width + " d3");
		p.add(descriptionL3);

		Dimension quizButtonSize = quizButton.getPreferredSize();
		quizButton.setBounds(637, 400, quizButtonSize.width, quizButtonSize.height);
		quizButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clear();
				quizQuestionScreen1();
			}
		});
		System.out.println(quizButtonSize.width + " qB");
		p.add(quizButton);

		Dimension titleButtonSize = titleButton.getPreferredSize();
		titleButton.setBounds(642, 500, titleButtonSize.width, titleButtonSize.height);
		titleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clear();
				title();
			}
		});
		System.out.println(titleButtonSize.width + " tB");
		p.add(titleButton);

		f.add(p);

	}

	public static void quizQuestionScreen1() {

		JCheckBox[] x = new JCheckBox[] {
				// sports dogs
				new JCheckBox("I spend my free time outside in the fresh air"),
				new JCheckBox("I am entertained by hiking"), new JCheckBox("I have recently been to a park"),
				new JCheckBox("I would hate a job where I couldn't go outside"),
				new JCheckBox("I try and have a positive outlook on everything I can"),
				new JCheckBox("I actively eat energy bars"), new JCheckBox("Water is one of my favorite drinks"),
				new JCheckBox("I listen to classic rock"),
				new JCheckBox("I have friends I have spent a long time with"),
				new JCheckBox("My room is bright and airy with lots of movement space"),

				// toydogs
				new JCheckBox("I spend my free time in bed"), new JCheckBox("I am entertained by shopping"),
				new JCheckBox("My wardrobe is extensive"), new JCheckBox("I enjoy the little things in life"),
				new JCheckBox("I love attention"), new JCheckBox("I love the mall cafeteria"),
				new JCheckBox("I only drink Fiji water"), new JCheckBox("I listen to pop music"),
				new JCheckBox("I have many friends but I'm not really close with any of them"),
				new JCheckBox("My room is messy but decorated nicely"),

				// intelegent dogs
				new JCheckBox("I spend my free time doing a puzzle"),
				new JCheckBox("I am entertained by watching jeopardy"),
				new JCheckBox("I have a low tolerance for immature people"),
				new JCheckBox("I only have a few close friends that I care about deeply"),
				new JCheckBox("I am logic driven but I try to keep an open mind"),
				new JCheckBox("I like to cook my own meals"), new JCheckBox("Coffee is one of my favorite drinks"),
				new JCheckBox("I listen to underground indie music"),
				new JCheckBox("I associate myself with many people, but there are very few people I trust"),
				new JCheckBox("My room is littered with books and things im working on") };

		Dimension JCheckBoxSize = x[29].getPreferredSize();

		shuffleArray(x);

		for (int i = 0; i < 30; i++) {
			// setting bounds for individual checkboxes
			if (i == 0)
				x[i].setBounds(80, 200, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 1)
				x[i].setBounds(80, 225, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 2)
				x[i].setBounds(80, 250, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 3)
				x[i].setBounds(80, 275, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 4)
				x[i].setBounds(80, 300, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 5)
				x[i].setBounds(80, 325, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 6)
				x[i].setBounds(80, 350, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 7)
				x[i].setBounds(80, 375, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 8)
				x[i].setBounds(80, 400, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 9)
				x[i].setBounds(80, 425, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 10)
				x[i].setBounds(80, 450, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 11)
				x[i].setBounds(80, 475, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 12)
				x[i].setBounds(80, 500, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 13)
				x[i].setBounds(80, 525, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 14)
				x[i].setBounds(80, 550, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 15)
				x[i].setBounds(80, 575, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 16)
				x[i].setBounds(700, 200, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 17)
				x[i].setBounds(700, 225, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 18)
				x[i].setBounds(700, 250, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 19)
				x[i].setBounds(700, 275, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 20)
				x[i].setBounds(700, 300, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 21)
				x[i].setBounds(700, 325, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 22)
				x[i].setBounds(700, 350, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 23)
				x[i].setBounds(700, 375, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 24)
				x[i].setBounds(700, 400, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 25)
				x[i].setBounds(700, 425, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 26)
				x[i].setBounds(700, 450, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 27)
				x[i].setBounds(700, 475, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 28)
				x[i].setBounds(700, 500, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 29)
				x[i].setBounds(700, 525, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 30)
				x[i].setBounds(700, 550, JCheckBoxSize.width, JCheckBoxSize.height);

			p.add(x[i]);

		}

		JLabel intro = new JLabel("Check each box that applies to you, then click next.");
		intro.setFont(quizF);

		JButton nextPage = new JButton("Next");

		// placement
		Dimension titleSize = intro.getPreferredSize();
		intro.setBounds(20, 75, titleSize.width, titleSize.height);
		intro.setForeground(Color.DARK_GRAY);
		p.add(intro);

		Dimension nextPageSize = nextPage.getPreferredSize();
		nextPage.setBounds(700, 700, nextPageSize.width, nextPageSize.height);
		nextPage.setForeground(Color.DARK_GRAY);
		p.add(nextPage);

		nextPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clear();
				quizQuestionScreen2();
				for (int k = 0; k < 30; k++) {
					if (x[k].isSelected() && ((x[k].getText() == "I spend my free time outside in the fresh air")
							|| (x[k].getText() == "I am entertained by hiking")
							|| (x[k].getText() == "I have recently been to a park")
							|| (x[k].getText() == "I would hate a job where I couldn't go outside")
							|| (x[k].getText() == "I try and have a positive outlook on everything I can")
							|| (x[k].getText() == "I actively eat energy bars")
							|| (x[k].getText() == "Water is one of my favorite drinks")
							|| (x[k].getText() == "I listen to classic rock")
							|| (x[k].getText() == "I have friends I have spent a long time with")
							|| (x[k].getText() == "My room is bright and airy with lots of movement space.")))
						answerSportsDogs += 1;

					if (x[k].isSelected() && ((x[k].getText() == "I spend my free time in bed")
							|| (x[k].getText() == "I am entertained by shopping")
							|| (x[k].getText() == "My wardrobe is extensive")
							|| (x[k].getText() == "I enjoy the little things in life")
							|| (x[k].getText() == "I love attention") || (x[k].getText() == "I love the mall cafeteria")
							|| (x[k].getText() == "I only drink Fiji water")
							|| (x[k].getText() == "I listen to pop music")
							|| (x[k].getText() == "I have many friends but I'm not really close with any of them")
							|| (x[k].getText() == "My room is messy but decorated nicely")))
						answerToyDogs += 1;

					if (x[k].isSelected() && ((x[k].getText() == "I spend my free time doing a puzzle")
							|| (x[k].getText() == "I am entertained by watching jeopardy")
							|| (x[k].getText() == "I have a low tolerance for immature people")
							|| (x[k].getText() == "I only have a few close friends that I care about deeply")
							|| (x[k].getText() == "I am logic driven but I try to keep an open mind")
							|| (x[k].getText() == "	I like to cook my own meals")
							|| (x[k].getText() == "	Coffee is one of my favorite drinks")
							|| (x[k].getText() == "I listen to underground indie music")
							|| (x[k].getText() == "I associate myself with many people, but there are very few people I trust ")
							|| (x[k].getText() == "My room is littered with books and things im working on")))
						answerIntelligentDogs += 1;
				}
				System.out.println(answerSportsDogs);
			}
		});

		f.add(p);

	}

	public static void quizQuestionScreen2() {

		JCheckBox[] x = new JCheckBox[] {
				// sports dogs
				new JCheckBox("I spend my free time getting extra work done early"),
				new JCheckBox("I am entertained by building things"),
				new JCheckBox("I like to think of myself as a loyal person"),
				new JCheckBox("When I start something, I finish it before I move on to something else"),
				new JCheckBox("I will not accept failure"),
				new JCheckBox("I'm not very good at cooking, but I try my best"),
				new JCheckBox("Its uncommon for me to pass up a drink with friends"),
				new JCheckBox("I listen to country music"),
				new JCheckBox("I have a good handful of friends I can trust"), new JCheckBox("My room is rather plain"),

				// family dogs
				new JCheckBox("I spend my free time with my friends and family"),
				new JCheckBox("I am entertained at family dinners"),
				new JCheckBox("I have a plentiful amount of friends and I love being around all of them"),
				new JCheckBox("There is always a smile on my face"),
				new JCheckBox("I tend to uplift others any chance I get"),
				new JCheckBox("People say they love to be around me"),
				new JCheckBox("I like to go out for food with my friends a lot"),
				new JCheckBox("I enjoy drinking juice"), new JCheckBox("I have tons of friends"),
				new JCheckBox("I have lots of pictures of the people I care about in my room"),

				// elegant dogs
				new JCheckBox("I spend my free time painting my nails"),
				new JCheckBox("I am entertained by practicing self-care"),
				new JCheckBox("I enjoy eating out at nice restaurants"),
				new JCheckBox("I hate it when people associate intelligence with looks"),
				new JCheckBox("I can be shy at times, but I open up around the people I care about"),
				new JCheckBox("I go to fancy restaurants a lot"), new JCheckBox("Pellegrino is my favorite drink"),
				new JCheckBox("I listen to classical music"),
				new JCheckBox("I am very picky about the friends I associate myself with"),
				new JCheckBox("I love decorating my room") };

		Dimension JCheckBoxSize = x[3].getPreferredSize();

		shuffleArray(x);

		for (int i = 0; i < 30; i++) {
			// setting bounds for individual checkboxes
			if (i == 0)
				x[i].setBounds(80, 200, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 1)
				x[i].setBounds(80, 225, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 2)
				x[i].setBounds(80, 250, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 3)
				x[i].setBounds(80, 275, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 4)
				x[i].setBounds(80, 300, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 5)
				x[i].setBounds(80, 325, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 6)
				x[i].setBounds(80, 350, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 7)
				x[i].setBounds(80, 375, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 8)
				x[i].setBounds(80, 400, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 9)
				x[i].setBounds(80, 425, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 10)
				x[i].setBounds(80, 450, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 11)
				x[i].setBounds(80, 475, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 12)
				x[i].setBounds(80, 500, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 13)
				x[i].setBounds(80, 525, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 14)
				x[i].setBounds(80, 550, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 15)
				x[i].setBounds(80, 575, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 16)
				x[i].setBounds(700, 200, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 17)
				x[i].setBounds(700, 225, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 18)
				x[i].setBounds(700, 250, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 19)
				x[i].setBounds(700, 275, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 20)
				x[i].setBounds(700, 300, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 21)
				x[i].setBounds(700, 325, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 22)
				x[i].setBounds(700, 350, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 23)
				x[i].setBounds(700, 375, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 24)
				x[i].setBounds(700, 400, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 25)
				x[i].setBounds(700, 425, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 26)
				x[i].setBounds(700, 450, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 27)
				x[i].setBounds(700, 475, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 28)
				x[i].setBounds(700, 500, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 29)
				x[i].setBounds(700, 525, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 30)
				x[i].setBounds(700, 550, JCheckBoxSize.width, JCheckBoxSize.height);

			p.add(x[i]);

		}

		JLabel intro = new JLabel("Check each box that applies to you, then click next.");
		intro.setFont(quizF);

		JButton nextPage = new JButton("Next");

		// placement
		Dimension titleSize = intro.getPreferredSize();
		intro.setBounds(20, 75, titleSize.width, titleSize.height);
		intro.setForeground(Color.DARK_GRAY);
		p.add(intro);

		Dimension nextPageSize = nextPage.getPreferredSize();
		nextPage.setBounds(700, 700, nextPageSize.width, nextPageSize.height);
		nextPage.setForeground(Color.DARK_GRAY);
		p.add(nextPage);

		nextPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clear();
				quizQuestionScreen3();
				for (int k = 0; k < 30; k++) {
					if (x[k].isSelected() && ((x[k].getText() == "I spend my free time getting extra work done early")
							|| (x[k].getText() == "I am entertained by building things")
							|| (x[k].getText() == "I like to think of myself as a loyal person")
							|| (x[k].getText() == "When I start something, I finish it before I move on to something else")
							|| (x[k].getText() == "I will not accept failure")
							|| (x[k].getText() == "I'm not very good at cooking, but I try my best")
							|| (x[k].getText() == "Its uncommon for me to pass up a drink with friends")
							|| (x[k].getText() == "I listen to country music")
							|| (x[k].getText() == "I have a good handful of friends I can trust")
							|| (x[k].getText() == "My room is rather plain")))
						answerWorkingDogs += 1;

					if (x[k].isSelected() && ((x[k].getText() == "I spend my free time with my friends and family")
							|| (x[k].getText() == "I am entertained at family dinners")
							|| (x[k].getText() == "I have a plentiful amount of friends and I love being around all of them")
							|| (x[k].getText() == "There is always a smile on my face")
							|| (x[k].getText() == "I tend to uplift others any chance I get")
							|| (x[k].getText() == "People say they love to be around me")
							|| (x[k].getText() == "I like to go out for food with my friends a lot")
							|| (x[k].getText() == "I enjoy drinking juice")
							|| (x[k].getText() == "I have tons of friends")
							|| (x[k].getText() == "I have lots of pictures of the people I care about in my room")))
						answerFamilyDogs += 1;

					if (x[k].isSelected() && ((x[k].getText() == "I spend my free time painting my nails")
							|| (x[k].getText() == "I am entertained by practicing self-care")
							|| (x[k].getText() == "I enjoy eating out at nice restaurants")
							|| (x[k].getText() == "I hate it when people associate intelligence with looks")
							|| (x[k].getText() == "I can be shy at times, but I open up around the people I care about")
							|| (x[k].getText() == "I go to fancy restaurants a lot")
							|| (x[k].getText() == "Pellegrino is my favorite drink")
							|| (x[k].getText() == "I listen to classical music")
							|| (x[k].getText() == "I am very picky about the friends I associate myself with")
							|| (x[k].getText() == "I love decorating my room")))
						answerElegantDogs += 1;
				}

			}
		});
		f.add(p);

	}

	public static void quizQuestionScreen3() {
		JCheckBox[] x = new JCheckBox[] {
				// easy dogs
				new JCheckBox("I spend my free time watching TV"), 
				new JCheckBox("I can easily entertain myself"),
				new JCheckBox("I can make a meal out of everything"),
				new JCheckBox("I never have a problem finding what to watch on Netflix"),
				new JCheckBox("It isn't hard for me to pick up a random book and enjoy it"),
				new JCheckBox("I dont go shopping for food until my fridge is empty; i make use out of everything"),
				new JCheckBox("I don't really drink sodas"), 
				new JCheckBox("I listen to whatever is on the radio"),
				new JCheckBox("I make friend easily and understand that they come and go"),
				new JCheckBox("I don't clutter my room very much, I keep what I need"),

				// mutt dogs

				new JCheckBox("I spend my free time doing anything and everything"),
				new JCheckBox("I am entertained by anything"), 
				new JCheckBox("People tell me I'm unpredictable"),
				new JCheckBox("I take opportunities as they come to me"),
				new JCheckBox("My mood is generally unpredictable"),
				new JCheckBox("There are very little foods I will not eat"),
				new JCheckBox("I'm not picky when it comes to what I order to drink at a restaurant."),
				new JCheckBox("I have no distinct taste in music"),
				new JCheckBox("I've generally been surrounded with enough friends to satisfy me"),
				new JCheckBox("My room has a lot of random things scattered around but it still feels organized")

		};

		Dimension JCheckBoxSize = x[3].getPreferredSize();

		shuffleArray(x);

		for (int i = 0; i < 30; i++) {
			// setting bounds for individual checkboxes
			if (i == 0)
				x[i].setBounds(80, 200, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 1)
				x[i].setBounds(80, 225, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 2)
				x[i].setBounds(80, 250, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 3)
				x[i].setBounds(80, 275, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 4)
				x[i].setBounds(80, 300, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 5)
				x[i].setBounds(80, 325, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 6)
				x[i].setBounds(80, 350, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 7)
				x[i].setBounds(80, 375, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 8)
				x[i].setBounds(80, 400, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 9)
				x[i].setBounds(80, 425, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 10)
				x[i].setBounds(80, 450, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 11)
				x[i].setBounds(700, 200, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 12)
				x[i].setBounds(700, 225, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 13)
				x[i].setBounds(700, 250, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 14)
				x[i].setBounds(700, 275, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 15)
				x[i].setBounds(700, 300, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 16)
				x[i].setBounds(700, 325, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 17)
				x[i].setBounds(700, 350, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 18)
				x[i].setBounds(700, 375, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 19)
				x[i].setBounds(700, 400, JCheckBoxSize.width, JCheckBoxSize.height);
			if (i == 20)
				x[i].setBounds(700, 425, JCheckBoxSize.width, JCheckBoxSize.height);

			p.add(x[i]);

		}

		JLabel intro = new JLabel("Check each box that applies to you, then click next.");
		intro.setFont(quizF);

		JButton finishPage = new JButton("Finish");

		// placement
		Dimension titleSize = intro.getPreferredSize();
		intro.setBounds(20, 75, titleSize.width, titleSize.height);
		intro.setForeground(Color.DARK_GRAY);
		p.add(intro);

		Dimension finishPageSize = finishPage.getPreferredSize();
		finishPage.setBounds(700, 700, finishPageSize.width, finishPageSize.height);
		finishPage.setForeground(Color.DARK_GRAY);
		p.add(finishPage);

		finishPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clear();
				quizFinishScreen();
				for (int k = 0; k < 30; k++) {
					if (x[k].isSelected() && ((x[k].getText() == "I spend my free time watching TV")
							|| (x[k].getText() == "I can easily entertain myself")
							|| (x[k].getText() == "I can make a meal out of everything")
							|| (x[k].getText() == "I never have a problem finding what to watch on Netflix")
							|| (x[k].getText() == "It isn't hard for me to pick up a random book and enjoy it")
							|| (x[k].getText() == "I dont go shopping for food until my fridge is empty; i make use out of everything")
							|| (x[k].getText() == "I don't really drink sodas")
							|| (x[k].getText() == "I listen to whatever is on the radio")
							|| (x[k].getText() == "I make friend easily and understand that they come and go")
							|| (x[k].getText() == "I don't clutter my room very much, I keep what I need")))
						answerEasyDogs += 1;

					if (x[k].isSelected() && ((x[k].getText() == "I spend my free time doing anything and everything")
							|| (x[k].getText() == "I am entertained by anything")
							|| (x[k].getText() == "People tell me I'm unpredictable")
							|| (x[k].getText() == "I take opportunities as they come to me")
							|| (x[k].getText() == "My mood is generally unpredictable")
							|| (x[k].getText() == "There are very little foods I will not eat")
							|| (x[k].getText() == "I'm not picky when it comes to what I order to drink at a restaurant.")
							|| (x[k].getText() == "I have no distinct taste in music")
							|| (x[k].getText() == "I've generally been surrounded with enough friends to satisfy me")
							|| (x[k].getText() == "My room has a lot of random things scattered around but it still feels organized")))
						answerMuttDogs += 1;

				}
			}
		});
		f.add(p);
	}

	// Fisher Yates shuffle
	static void shuffleArray(JCheckBox[] x) {
		Random rand = ThreadLocalRandom.current();
		for (int i = x.length - 1; i > 0; i--) {
			int index = rand.nextInt(i + 1);
			//  swap
			JCheckBox a = x[index];
			x[index] = x[i];
			x[i] = a;
		}
	}

	public static void quizFinishScreen() {

	}

	public static void mapScreen() {

	}

	public static void dogsScreen() {

	}

	public static void quit() {
		// exit program
		System.exit(0);
	}

	public static void clear() {
		// clear frame
		System.out.println("cleared");
		f.getContentPane().revalidate();
		f.getContentPane().removeAll();
		f.getContentPane().repaint();
		p.removeAll();
		p.updateUI();
	}

	public static void main(String[] args) {
		title();
	}

}
