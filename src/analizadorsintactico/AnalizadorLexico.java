/* The following code was generated by JFlex 1.5.0-SNAPSHOT */


/* --------------------------Codigo de Usuario----------------------- */
package analizadorsintactico;

import java_cup.runtime.*;
import java.io.Reader;
import java.lang.System;

      

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.5.0-SNAPSHOT
 * from the specification file <tt>alexicoparasintactico.flex</tt>
 */
public class AnalizadorLexico implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\2\1\15\1\16\1\1\22\0\1\3\1\0\1\14"+
    "\5\0\1\46\1\47\1\22\1\12\1\43\1\13\1\10\1\22\1\4"+
    "\11\5\1\45\1\44\1\20\1\21\1\17\2\0\1\36\1\40\1\27"+
    "\1\33\1\11\1\23\1\6\1\35\1\32\2\6\1\30\1\6\1\26"+
    "\1\24\1\25\1\6\1\37\1\31\1\34\1\42\1\6\1\41\3\6"+
    "\6\0\32\7\12\0\1\15\u1fa2\0\1\15\1\15\udfd6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\2\3\1\1\1\4\1\1\1\5"+
    "\1\1\2\6\1\7\1\10\7\1\1\11\1\12\1\13"+
    "\1\14\1\15\2\0\1\16\3\0\1\6\4\0\1\17"+
    "\6\0\1\20\2\0\1\21\4\0\1\22\11\0\1\23"+
    "\1\0\1\24\1\0\1\25\6\0\1\26\2\0\1\27"+
    "\1\30\1\31\2\0\1\32\1\33\1\34\2\0\1\35"+
    "\3\0\1\36\1\37\1\40";

  private static int [] zzUnpackAction() {
    int [] result = new int[94];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\50\0\120\0\50\0\170\0\240\0\310\0\50"+
    "\0\360\0\50\0\u0118\0\u0140\0\u0168\0\u0140\0\u0190\0\u01b8"+
    "\0\u01e0\0\u0208\0\u0230\0\u0258\0\u0280\0\u02a8\0\50\0\50"+
    "\0\50\0\50\0\50\0\170\0\u02d0\0\u02f8\0\u0320\0\u0348"+
    "\0\u0370\0\50\0\u0398\0\u03c0\0\u03e8\0\u0410\0\50\0\u0438"+
    "\0\u0460\0\u0488\0\u04b0\0\u04d8\0\u0500\0\u0528\0\u0550\0\u0578"+
    "\0\u0370\0\u05a0\0\u05c8\0\u05f0\0\u0618\0\50\0\u0640\0\u0668"+
    "\0\u0690\0\u06b8\0\u06e0\0\u0708\0\u0730\0\u0758\0\u0780\0\50"+
    "\0\u07a8\0\50\0\u07d0\0\50\0\u07f8\0\u0820\0\u0848\0\u0870"+
    "\0\u0898\0\u08c0\0\50\0\u08e8\0\u0910\0\50\0\50\0\50"+
    "\0\u0938\0\u0960\0\50\0\50\0\50\0\u0988\0\u09b0\0\50"+
    "\0\u09d8\0\u0a00\0\u0a28\0\50\0\50\0\50";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[94];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\2\4\1\5\1\6\1\7\1\2\1\10"+
    "\1\11\2\12\1\13\1\0\1\4\1\14\1\15\1\16"+
    "\1\12\1\17\1\20\2\7\1\21\2\7\1\22\4\7"+
    "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\1\33\52\0\1\4\51\0\2\34\2\0\1\35\43\0"+
    "\2\6\2\0\1\35\46\0\1\36\47\0\1\36\16\0"+
    "\1\37\1\0\1\40\17\0\1\41\2\0\12\41\2\0"+
    "\31\41\21\0\1\42\45\0\1\42\1\0\1\42\35\0"+
    "\1\36\20\0\1\43\26\0\1\36\15\0\1\44\31\0"+
    "\1\36\20\0\1\45\4\0\1\46\21\0\1\36\13\0"+
    "\1\47\2\0\1\50\4\0\1\51\23\0\1\36\1\0"+
    "\1\52\45\0\1\36\14\0\1\53\32\0\1\36\25\0"+
    "\1\54\21\0\1\36\16\0\1\55\25\0\2\56\46\0"+
    "\2\36\1\0\1\36\73\0\1\57\45\0\1\60\16\0"+
    "\1\41\2\0\11\41\1\61\2\0\31\41\24\0\1\62"+
    "\34\0\1\63\62\0\1\64\61\0\1\65\45\0\1\66"+
    "\24\0\1\67\63\0\1\70\46\0\1\71\55\0\1\72"+
    "\51\0\1\73\17\0\2\56\3\0\1\74\1\0\1\75"+
    "\66\0\1\76\6\0\1\77\17\0\1\100\74\0\1\101"+
    "\37\0\1\102\52\0\1\103\55\0\1\104\36\0\1\105"+
    "\32\0\1\106\66\0\1\107\47\0\1\110\51\0\1\111"+
    "\27\0\1\75\41\0\2\112\65\0\1\113\7\0\1\114"+
    "\51\0\1\115\46\0\1\116\24\0\1\117\72\0\1\120"+
    "\51\0\1\121\22\0\1\122\47\0\1\123\66\0\1\124"+
    "\23\0\2\125\53\0\1\126\70\0\1\127\51\0\1\130"+
    "\51\0\1\131\37\0\1\132\51\0\1\133\45\0\1\134"+
    "\55\0\1\135\24\0\1\136\36\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2640];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\1\11\3\1\1\11\1\1\1\11"+
    "\14\1\5\11\2\0\1\1\3\0\1\11\4\0\1\11"+
    "\6\0\1\1\2\0\1\1\4\0\1\11\11\0\1\11"+
    "\1\0\1\11\1\0\1\11\6\0\1\11\2\0\3\11"+
    "\2\0\3\11\2\0\1\11\3\0\3\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[94];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    /*  Generamos un java_cup.Symbol para guardar el tipo de token 
        encontrado */
    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }
    
    /* Generamos un Symbol para el tipo de token encontrado 
       junto con su valor */
    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public AnalizadorLexico(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public AnalizadorLexico(java.io.InputStream in) {
    this(new java.io.InputStreamReader
             (in, java.nio.charset.Charset.forName("UTF-8")));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 116) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

    // numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 1: 
          { System.out.println(yytext()+"error");
          }
        case 33: break;
        case 2: 
          { /* ignora el espacio */
          }
        case 34: break;
        case 3: 
          { return symbol(sym.NONENTERO,new token(yytext(),yychar,yyline));
          }
        case 35: break;
        case 4: 
          { return symbol(sym.NONPUNTO,new token(yytext(),yychar,yyline));
          }
        case 36: break;
        case 5: 
          { return symbol(sym.NONARIT,new token(yytext(),yychar,yyline));
          }
        case 37: break;
        case 6: 
          { return symbol(sym.NONREL,new token(yytext(),yychar,yyline));
          }
        case 38: break;
        case 7: 
          { return symbol(sym.NONIGUAL,new token(yytext(),yychar,yyline));
          }
        case 39: break;
        case 8: 
          { return symbol(sym.NONEFE,new token(yytext(),yychar,yyline));
          }
        case 40: break;
        case 9: 
          { return symbol(sym.NONCOMA,new token(yytext(),yychar,yyline));
          }
        case 41: break;
        case 10: 
          { return symbol(sym.NONPUNTOYCOMA,new token(yytext(),yychar,yyline));
          }
        case 42: break;
        case 11: 
          { return symbol(sym.NONDOSPUNTOS,new token(yytext(),yychar,yyline));
          }
        case 43: break;
        case 12: 
          { return symbol(sym.NONPARABRE,new token(yytext(),yychar,yyline));
          }
        case 44: break;
        case 13: 
          { return symbol(sym.NONPARCIERRA,new token(yytext(),yychar,yyline));
          }
        case 45: break;
        case 14: 
          { return symbol(sym.NONIDENTIFICADOR, new token(yytext(),yychar,yyline));
          }
        case 46: break;
        case 15: 
          { return symbol(sym.NONIF,new token(yytext(),yychar,yyline));
          }
        case 47: break;
        case 16: 
          { return symbol(sym.NONREAL,new token(yytext(),yychar,yyline));
          }
        case 48: break;
        case 17: 
          { return symbol(sym.NONSTRING,new token(yytext(),yychar,yyline));
          }
        case 49: break;
        case 18: 
          { return symbol(sym.NONINT,new token(yytext(),yychar,yyline));
          }
        case 50: break;
        case 19: 
          { return symbol(sym.NONELSE,new token(yytext(),yychar,yyline));
          }
        case 51: break;
        case 20: 
          { return symbol(sym.NONOPEN,new token(yytext(),yychar,yyline));
          }
        case 52: break;
        case 21: 
          { return symbol(sym.NONCHAR,new token(yytext(),yychar,yyline));
          }
        case 53: break;
        case 22: 
          { return symbol(sym.NONENDIF,new token(yytext(),yychar,yyline));
          }
        case 54: break;
        case 23: 
          { return symbol(sym.NONFLOAT,new token(yytext(),yychar,yyline));
          }
        case 55: break;
        case 24: 
          { return symbol(sym.NONCLOS,new token(yytext(),yychar,yyline));
          }
        case 56: break;
        case 25: 
          { return symbol(sym.NONIDENT,new token(yytext(),yychar,yyline));
          }
        case 57: break;
        case 26: 
          { return symbol(sym.NONWHILE,new token(yytext(),yychar,yyline));
          }
        case 58: break;
        case 27: 
          { return symbol(sym.NONUNTIL,new token(yytext(),yychar,yyline));
          }
        case 59: break;
        case 28: 
          { return symbol(sym.NONREALCIENT,new token(yytext(),yychar,yyline));
          }
        case 60: break;
        case 29: 
          { return symbol(sym.NONREPEAT,new token(yytext(),yychar,yyline));
          }
        case 61: break;
        case 30: 
          { return symbol(sym.NONBOOLEAN,new token(yytext(),yychar,yyline));
          }
        case 62: break;
        case 31: 
          { return symbol(sym.NONENDIDENT,new token(yytext(),yychar,yyline));
          }
        case 63: break;
        case 32: 
          { return symbol(sym.NONENDWHILE,new token(yytext(),yychar,yyline));
          }
        case 64: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}