Story: Tennis Game

Meta:
@scope jBehave practice

Narrative:
    Watch tennis game score as it proceeds

Scenario: Game starts
Given a new game with players Ram and Shyam
Then score should be love|love

Scenario: Player1 wins a ball
Given a new game with players Ram and Shyam
When Player1 wins a ball
Then score should be fifteen|love

Scenario: Player2 wins a ball
Given a new game with players Ram and Shyam
When Player2 wins a ball
Then score should be love|fifteen

Scenario: Player1 wins a ball 3 times
Given a new game with players Ram and Shyam
When Player1 wins a ball
And Player1 wins a ball
And Player1 wins a ball
Then score should be forty|love

Scenario: Deuce
Given a new game with players Ram and Shyam
When Player1 wins a ball
And Player1 wins a ball
And Player1 wins a ball
And Player2 wins a ball
And Player2 wins a ball
And Player2 wins a ball
Then score should be deuce

Scenario: Advantage
Given a new game with players Ram and Shyam
When Player1 wins a ball
And Player1 wins a ball
And Player1 wins a ball
And Player2 wins a ball
And Player2 wins a ball
And Player2 wins a ball
And Player2 wins a ball
Then score should be advantage Shyam

Scenario: Win
Given a new game with players Ram and Shyam
When Player1 wins a ball
And Player1 wins a ball
And Player1 wins a ball
And Player2 wins a ball
And Player1 wins a ball
Then score should be Ram won
