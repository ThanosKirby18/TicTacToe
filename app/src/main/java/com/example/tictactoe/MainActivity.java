package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //This is the 2D Array that will hold the values of the tic-tac-toe board
    private int [][]gridArray = fullGrid();
    int playerTurn = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void firstRowLeftClick(View v)
    {
        gridArray[0][0] = 1;
        Toast.makeText(this, "you clicked button 1", Toast.LENGTH_SHORT).show();

        winCondition();

        drawCondition();

    }//end function for the Button 1

    public void firstRowMiddleLeftClick(View v)
    {
        gridArray[0][1] = 1;
        Toast.makeText(this, "you clicked button 2", Toast.LENGTH_SHORT).show();

        winCondition();

        drawCondition();

    }//end function for the Button 2

    public void firstRowMiddleRightClick(View v)
    {
        gridArray[0][2] = 1;
        Toast.makeText(this, "you clicked button 3", Toast.LENGTH_SHORT).show();

        winCondition();

        drawCondition();

    }//end function for the Button 3

    public void firstRowRightClick(View v)
    {
        gridArray[0][3] = 1;
        Toast.makeText(this, "you clicked button 10", Toast.LENGTH_SHORT).show();

        winCondition();

        drawCondition();
    }//end function for the button 10

    public void secondRowLeftClick(View v)
    {
        gridArray[1][0] = 1;
        Toast.makeText(this, "you clicked button 4", Toast.LENGTH_SHORT).show();

        winCondition();

        drawCondition();

    }//end function for the Button 4

    public void secondRowMiddleLeftClick(View v)
    {
        gridArray[1][1] = 1;
        Toast.makeText(this, "you clicked button 5", Toast.LENGTH_SHORT).show();

        winCondition();

        drawCondition();

    }//end function for the Button 5

    public void secondRowMiddleRightClick(View v)
    {
        gridArray[1][2] = 1;
        Toast.makeText(this, "you clicked button 6", Toast.LENGTH_SHORT).show();

        winCondition();

        drawCondition();

    }//end function for the Button 6

    public void secondRowRightClick(View v)
    {
        gridArray[1][3] = 1;
        Toast.makeText(this, "you clicked button 11", Toast.LENGTH_SHORT).show();

        winCondition();

        drawCondition();
    }//end function for the Button 11

    public void thirdRowLeftClick(View v)
    {
        gridArray[2][0] = 1;
        Toast.makeText(this, "you clicked button 7", Toast.LENGTH_SHORT).show();

        winCondition();

        drawCondition();

    }//end function for the Button 7

    public void thirdRowMiddleLeftClick(View v)
    {
        gridArray[2][1] = 1;
        Toast.makeText(this, "you clicked button 8", Toast.LENGTH_SHORT).show();

        winCondition();

        drawCondition();

    }//end function for the Button 8

    public void thirdRowMiddleRightClick(View v)
    {
        gridArray[2][2] = 1;
        Toast.makeText(this, "you clicked button 9", Toast.LENGTH_SHORT).show();
        winCondition();

        drawCondition();
    }//end function for the Button 9

    public void thirdRowRightClick(View v)
    {
        gridArray[2][3] = 1;
        Toast.makeText(this, "you clicked button 12", Toast.LENGTH_SHORT).show();
        winCondition();

        drawCondition();
    }//end function for the Button 12

    public void fourthRowLeftClick(View v)
    {
        gridArray[3][0] = 1;
        Toast.makeText(this, "you clicked button 13", Toast.LENGTH_SHORT).show();
        winCondition();

        drawCondition();
    }//end function for the Button 13

    public void fourthRowMiddleLeftClick(View v)
    {
        gridArray[3][1] = 1;
        Toast.makeText(this, "you clicked button 14", Toast.LENGTH_SHORT).show();
        winCondition();

        drawCondition();
    }//end function for the BUtton 14

    public void fourthRowMiddleRightClick(View v)
    {
        gridArray[3][2] = 1;
        Toast.makeText(this, "you clicked button 15", Toast.LENGTH_SHORT).show();
        winCondition();

        drawCondition();
    }//end function for the Button 15

    public void fourthRowRightClick(View v)
    {
        gridArray[3][3] = 1;
        Toast.makeText(this, "you clicked button 16", Toast.LENGTH_SHORT).show();
        winCondition();

        drawCondition();
    }//end function for the Button 16

    //draw condition (x = 1, o = 0)
    public void drawCondition()
    {
        playerTurn++;
        Log.i("count", "playerTurn count is " + playerTurn);
        if(playerTurn == 10)
        {
            Log.i("info", "This is a draw");
        }

    }

    private int[][] fullGrid()
    {
        int[][]grid = new int[4][4];
        for(int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = 2;
            }
        }
        return grid;
    }//method to fill up the entire gridArray with the value of 2 to represent an empty board

    private void winCondition()
    {
        for(int i = 0; i < 4;i++)
        {
            if(gridArray[i][0]== 1 && gridArray[i][1]== 1 && gridArray[i][2]== 1 && gridArray[i][3]==1)
            {
                //Toast.makeText(this, "X wins the game", Toast.LENGTH_SHORT).show();
            }//end if statement to check for win condition horizontally for X case
            else if(gridArray[0][i]==1 && gridArray[1][i]==1 && gridArray[2][i]==1 && gridArray[3][i]==1)
            {

            }//end if statement to check for win condition vertically for X case
            else if(gridArray[i][0]== 0 && gridArray[i][1]== 0 && gridArray[i][2]== 0 && gridArray[i][3]==0)
            {

            }//end if statement to check for win condition horizontally for O case
            else if(gridArray[0][i]==0 && gridArray[1][i]==0 && gridArray[2][i]==0 && gridArray[3][i]==0)
            {

            }//end if statement to check for win condition vertically for O case
        }//end for loop to check for horizontal and vertical cases for wins

        if(gridArray[0][0]==0 && gridArray[1][1]==0 && gridArray[2][2]==0 && gridArray[3][3]==0)
        {

        }//checks case for diagonal from top left to bottom right for if O wins
        else if(gridArray[0][3]==0 && gridArray[1][2]==0 && gridArray[2][1]==0 && gridArray[3][0]==0)
        {

        }//checks case for diagonal from top right to bottom left for if 0 wins
        else if(gridArray[0][0]==1 && gridArray[1][1]==1 && gridArray[2][2]==1 && gridArray[3][3]==1)
        {

        }//checks case for diagonal from top left to bottom right for if X wins
        else if(gridArray[0][3]==1 && gridArray[1][2]==1 && gridArray[2][1]==1 && gridArray[3][0]==1)
        {

        }//checks case for diagonal from top right to bottom left for if X wins

    }//method to check for win cases after each turn only for values of X and O being 1 and 0


}