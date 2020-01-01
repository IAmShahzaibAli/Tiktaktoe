package tictactoe;
public class Board 
{
    int[][] Board =  new int[3][3];
    public void InitializeBoard(){
    for(int i=0;i<=2;i++)
    {
      for(int j=0;j<=2;j++)
      {
         Board[i][j] = 2;
      }
    }
    }
    public int getBoardValue(int i,int j){
        
        
        return Board[i][j];
    
    
    }
    public void setBoardValue(int i,int j,int value){
        Board[i][j] = value;
    
    }
    public int possibleWin(int Player){
        if(Player == 1)
        {
            // Player 1
            // Rows 
            for(int i =0;i<=2;i++)
            {
            if(Board[i][0]*Board[i][1]*Board[i][2] == 18)
            {
               if(Board[i][0] ==2)
               {
               return (i*3+1);
               }
               else if(Board[i][1] == 2) 
               {
                   return (i*3+2);
               }
               else return (i*3+3);
            }
            }
             // Columns
            for(int j=0;j<=2;j++)
            {
            if(Board[0][j]*Board[1][j]*Board[2][j] == 18)
            {
               if(Board[0][j] ==2)
               {
               return (j+1);
               }
               else if(Board[1][j] == 2) 
               {
                   return (j+4);
               }
               else return (j+7);
        
              }
            }
            // Checking Left Diagnol
            if(Board[0][0]*Board[1][1]*Board[2][2] == 18)
            {
                  if(Board[0][0] == 2)
                  {
                   return 1;
                  }
                 else if(Board[1][1] == 2)
                  {
                    return 5;
                  }
                 else return 9;
                  
            }
             // Checking Right Diagnol
            if(Board[0][2]*Board[1][1]*Board[2][0] == 18)
            {
                  if(Board[0][2] == 2)
                  {
                   return 3;
                  }
                 else if(Board[1][1] == 2)
                  {
                    return 5;
                  }
                 else return 7;
                  
            }
           
            
            
        }
        else
        {
            // Player 2 
             // Rows 
            for(int i =0;i<=2;i++)
            {
            if(Board[i][0]*Board[i][1]*Board[i][2] == 50)
            {
               if(Board[i][0] ==2)
               {
               return (i*3+1);
               }
               else if(Board[i][1] == 2) 
               {
                   return (i*3+2);
               }
               else return (i*3+3);
            }
            }
             // Columns
            for(int j=0;j<=2;j++)
            {
            if(Board[0][j]*Board[1][j]*Board[2][j] == 50)
            {
               if(Board[0][j] ==2)
               {
               return (j+1);
               }
               else if(Board[1][j] == 2) 
               {
                   return (j+4);
               }
               else return (j+7);
        
              }
            }
            // Checking Left Diagnol
            if(Board[0][0]*Board[1][1]*Board[2][2] == 50)
            {
                  if(Board[0][0] == 2)
                  {
                   return 1;
                  }
                 else if(Board[1][1] == 2)
                  {
                    return 5;
                  }
                 else return 9;
                  
            }
             // Checking Right Diagnol
            if(Board[0][2]*Board[1][1]*Board[2][0] == 50)
            {
                  if(Board[0][2] == 2)
                  {
                   return 3;
                  }
                 else if(Board[1][1] == 2)
                  {
                    return 5;
                  }
                 else return 7;
                  
            }
           
            
            
        
        
        }
        return (0);
        
        
        
        
        
        
        
        
    
    
    }
    public boolean CheckWin(int Player){
        if(Player ==1)
        {
            // Checking Win For Rows
            for(int i=0;i<=2;i++)
            {
              if(Board[i][0] * Board[i][1]*Board[i][2] == 27)
              {
                 return true;
              
              }
            }
            // Checking Win For Columns
            for(int j=0;j<=2;j++)
            {
              if(Board[0][j] * Board[1][j]*Board[2][j] == 27)
              {
                 return true;
              
              }
            }
            // Checking Win For Diagnols
            if(Board[0][0] * Board[1][1] * Board[2][2] == 27)
            {
                  return true;
            }
            if(Board[0][2]*Board[1][1]*Board[2][0] == 27)
            {
            
                return true;
            
            }
        
        
        return false;
        }
        else
        {
            // Checking Win For Rows
            for(int i=0;i<=2;i++)
            {
              if(Board[i][0] * Board[i][1]*Board[i][2] == 125)
              {
                 return true;
              
              }
            }
            // Checking Win For Columns
            for(int j=0;j<=2;j++)
            {
              if(Board[0][j] * Board[1][j]*Board[2][j] == 125)
              {
                 return true;
              
              }
            }
            // Checking Win For Diagnols
            if(Board[0][0] * Board[1][1] * Board[2][2] == 125)
            {
                  return true;
            }
            if(Board[0][2]*Board[1][1]*Board[2][0] == 125 )
            {
            
                return true;
            
            }
        
        
        return false;
        
        
        }
        
        
    
    
    }
    public boolean isBoardFilled(){
     for(int i=0;i<=2;i++)
     {
         for(int j=0;j<=2;j++)
         {
             if(Board[i][j] == 2)
             {
                return false;
             
             }
         }
     }
     return false;
    
    }
    public int randomBlankButton() {
        int count = 0;
        int s= 0;
        
        for(int i=0;i<=2;i++)
        {
         for(int j=0;j<=2;j++)
         {
            if(Board[i][j]==2)
            {
                count++;
              
            }
         
         }
        }
        int r = 1+ (int)(Math.random()*count);
        for(int i=0;i<=2;i++)
        {
          for(int j=0;j<=2;j++)
          {
              s++;
             if(r==s)
             {
              if(i==0&&j==0) return 1;
              if(i==0&&j==1) return 2;
              if(i==0&&j==2) return 3;
              if(i==1&&j==0) return 4;
              if(i==1&&j==1) return 5;
              if(i==1&&j==2) return 6;
              if(i==2&&j==0) return 7;
              if(i==2&&j==1) return 8;
              if(i==2&&j==2) return 9;
              

                            
                            
              
             }
             
          
          }
        
        }
        return  0;

    
    }
    
    
    
    
    
    
    
    
    
    
    
}
