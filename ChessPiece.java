/**
 * Creates Chess pieces with what type
 * of piece they are and what position
 * they are on the board, either in array notation
 * or in regular chess notation.
 * @author Michael Goodrum
 * @version  1.0
 * @since 06-24-16
 */
public class ChessPiece {
    private int row;
    private int column;
    private String pType;
    private String position;
    /**
     * Instantiates chess piece with
     * array notation for location on board
     * @param  row    [int with row location on board array]
     * @param  column [int with column location on board]
     * @param  pType  [one letter representing the type of piece]
     */
    public ChessPiece(int row, int column, String pType) {
        String positionLetter;
        this.row = row;
        this.column = column;
        this.pType = pType;
        if (column == 0) {
            positionLetter = "A";
        } else if (column == 1) {
            positionLetter = "B";
        } else if (column == 2) {
            positionLetter = "C";
        } else if (column == 3) {
            positionLetter = "D";
        } else if (column == 4) {
            positionLetter = "E";
        } else if (column == 5) {
            positionLetter = "F";
        } else if (column == 6) {
            positionLetter = "G";
        } else {
            positionLetter = "H";
        }
        int positionInt = 8 - row;
        position = positionLetter + Integer.toString(positionInt);
    }
    /**
     * Instantiates chesse piece with
     * regular chess notation for location on board
     * @param  position [string with chess notation for location i.e D4]
     * @param  pType    [one letter representing the type of piece]
     */
    public ChessPiece(String position, String pType) {
        this.position = position;
        this.pType = pType;
        row = parseRowValue(position);
        column = parseColumnValue(position);
    }
    /**
     * Input chess notation for location and will
     * convert to array notation of row only
     * @param  chessRow [Input chess notation]
     * @return          [Returns just the row equivalent for that position]
     */
    public static int parseRowValue(String chessRow) {
        int cR;
        char temp = chessRow.charAt(1);
        if (temp == '1') {
            cR = 7;
        } else if (temp == '2') {
            cR = 6;
        } else if (temp == '3') {
            cR = 5;
        } else if (temp == '4') {
            cR = 4;
        } else if (temp == '5') {
            cR = 3;
        } else if (temp == '6') {
            cR = 2;
        } else if (temp == '7') {
            cR = 1;
        } else {
            cR = 0;
        }
        return cR;
    }
    /**
     * Input chess notation for location and will
     * convert to array notation of column only
     * @param  chessColumn [Input chess notation]
     * @return             [Returns just the row equivalent for that position]
     */
    public static int parseColumnValue(String chessColumn) {
        int cC;
        char temp = chessColumn.charAt(0);
        if (temp == 'A') {
            cC = 0;
        } else if (temp == 'B') {
            cC = 1;
        } else if (temp == 'C') {
            cC = 2;
        } else if (temp == 'D') {
            cC = 3;
        } else if (temp == 'E') {
            cC = 4;
        } else if (temp == 'F') {
            cC = 5;
        } else if (temp == 'G') {
            cC = 6;
        } else {
            cC = 7;
        }
        return cC;
    }
    /**
     * Returns one letter for chess piece type
     * @return [Single letter in form of string]
     */
    public String getType() {
        return pType;
    }
    /**
     * Returns one leter followed by a number for the
     * position, aka chess notation
     * @return [String with a capital letter followed by a int]
     */
    public String getPosition() {
        return position;
    }
    /**
     * Returns row of piece
     * @return [interger value]
     */
    public int getRow() {
        return row;
    }
    /**
     * Returns column of piece
     * @return [integer value]
     */
    public int getColumn() {
        return column;
    }
    /**
     * Prints string with full name of piece
     * and its location in both chess notation
     * and in array notation
     * @return [String with full description]
     */
    public String toString() {
        String pieceType;
        if (pType.equals("q")) {
            pieceType = "Queen";
        } else if (pType.equals("p")) {
            pieceType = "Pawn";
        } else if (pType.equals("n")) {
            pieceType = "Knight";
        } else if (pType.equals("k")) {
            pieceType = "King";
        } else if (pType.equals("b")) {
            pieceType = "Bishop";
        } else {
            pieceType = "Rook";
        }
        return pieceType + " at position " + getPosition() + " ("
            + getRow() + ", " + getColumn() + ")";
    }
}