/**
 * Creates a Board, which is an
 * array of chess pieces.
 * @author Michael Goodrum
 * @version 1.0
 * @since 06-24-16
 */
public class Board {
    private ChessPiece[][] backingArray;
    private int numOfKings;
    private int numBlankSpaces;
    /**
     * Creates board by intaking an
     * array of strings and converting
     * them to chess pieces
     * @param  allPositions [String array with the positions of the pieces]
     */
    public Board(String[][] allPositions) {
        int arrayRow = allPositions.length;
        int arrayColumn = allPositions[0].length;

        backingArray = new ChessPiece[arrayRow][arrayColumn];

        for (int row = 0; row < allPositions.length; row++) {
            for (int column = 0; column < allPositions[row].length; column++) {
                if (allPositions[row][column] != null) {
                    int pieceRow = row;
                    int pieceColumn = column;
                    String pieceType = allPositions[row][column];
                    ChessPiece piece = new ChessPiece(pieceRow,
                        pieceColumn, pieceType);
                    placePiece(piece);
                }
            }
        }
    }
    /**
     * Places piece on board if the slot
     * is currently empty
     * @param placePiece [intakes any chess piece]
     */
    public void placePiece(ChessPiece placePiece) {
        int row = placePiece.getRow();
        int column = placePiece.getColumn();
        if (backingArray[row][column] == null) {
            backingArray[row][column] = placePiece;
        } else {
            System.out.println("Already a piece in this position.");
        }
    }
    /**
     * Returns which piece is at
     * the location
     * @param  row    [array notation of the row]
     * @param  column [array notation of the int]
     * @return        [returns chess piece]
     */
    public ChessPiece getPieceAt(int row, int column) {
        return backingArray[row][column];
    }
    /**
     * Returns which piece is at
     * the location
     * @param  position [chess notation i.e "D5"]
     * @return          [returns chess piece]
     */
    public ChessPiece getPieceAt(String position) {
        return backingArray[ChessPiece.parseRowValue(position)]
            [ChessPiece.parseColumnValue(position)];
    }
    /**
     * Counts how many blank spaces
     * are on the board
     * @return [integer with amount of blanks]
     */
    public int numBlankSpaces() {
        for (int row = 0; row < backingArray.length; row++) {
            for (int column = 0; column < backingArray[row].length; column++) {
                if (backingArray[row][column] == null) {
                    numBlankSpaces += 1;
                }
            }
        } return numBlankSpaces;
    }
    /**
     * Returns true of game is over
     * in other words only one king present
     * @return [boolean with game status]
     */
    public boolean gameOver() {
        boolean gameOver = false;
        for (int row = 0; row < backingArray.length; row++) {
            for (int column = 0; column < backingArray[row].length; column++) {
                if (backingArray[row][column] != null) {
                    if (backingArray[row][column].getType().equals("k")) {
                        numOfKings += 1;
                    }
                }
            }
        }
        if (numOfKings <= 1) {
            gameOver = true;
        }
        return gameOver;
    }
    /**
     * Informs you if chosen chess piece
     * is completely surounded by
     * other pieces or not
     * @param  piece [choose chess piece]
     * @return       [boolean with result]
     */
    public boolean isSurrounded(ChessPiece piece) {
        boolean isSurrounded = false;
        int row = piece.getRow();
        int column = piece.getColumn();
        int token = 0;
        if ((column + 1 >= backingArray[0].length)
            || (backingArray[row][column + 1] != null)) {
            token += 1;
        }
        if ((column - 1 < 0) || (backingArray[row][column - 1] != null)) {
            token += 1;
        }
        if ((row + 1 >= backingArray.length)
            || (backingArray[row + 1][column] != null)) {
            token += 1;
        }
        if ((row - 1 < 0) || (backingArray[row - 1][column] != null)) {
            token += 1;
        }
        if ((column + 1 >= backingArray[0].length)
            || (row + 1 >= backingArray.length)
            || (backingArray[row + 1][column + 1] != null)) {
            token += 1;
        }
        if ((column + 1 >= backingArray[0].length) || (row - 1 < 0)
            || (backingArray[row - 1][column + 1] != null)) {
            token += 1;
        }
        if ((column - 1 < 0) || (row + 1 >= backingArray.length)
            || (backingArray[row + 1][column - 1] != null)) {
            token += 1;
        }
        if ((column - 1 < 0) || (row - 1 < 0)
            || (backingArray[row - 1][column - 1] != null)) {
            token += 1;
        }
        if (token == 8) {
            isSurrounded = true;
        }
        return isSurrounded;
    }
    /**
     * Returns string description of the piece
     * its location in chess notation
     * its location in array notation
     * and the pieces type full name
     * @return [String description]
     */
    public String toString() {
        String aString = "";
        for (int row = 0; row < backingArray.length; row++) {
            aString += "---------------------------------\n";
            for (int column = 0; column < backingArray[row].length; column++) {
                if (backingArray[row][column] == null) {
                    aString += "|   ";
                } else {
                    aString += "| " + backingArray[row][column].getType() + " ";
                }
            }
            aString += "|\n";
        } aString += "---------------------------------";
        return aString;
    }
}