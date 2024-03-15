grammar SimpleScript;

//test warunkowy
tokens {
keyword:

         script_start : 'start'||'s'|| 'start_script'
         script_end   : 'end'|| 'e'||'end_script'
         if : 'if'|| '?' 
         while: 'while' 
         open: 'open'  
         function : 'fn'|| 'fun'
         'create'
         'add' : 'add'|| '+'
         | 'color'
         | 'lib'
         | 'rev'
         | 'flay'
         stream_input: 'inp'|| 'input'|| '>>'
         | 'Str'
         | 'put'
         | 'build'
         | 'open'
         | 'list'
         | 'fn' 
         | 'adLang'
         | 'new'
         | 'prompt'
         | 'err'
         | 'ignore'
         | 'schear'
         | 'adLang'
data_types: 
         |'str'
         |'num'
         |'mixed'
         |'logic'
arytmetic_operators:
         | '+'
         |'-'
         | '*'
         |'/'
         | '%'
         | '*2'
onther_operators:
        |and
        |or
        |incrementation
        |decrementation
 streams_imp:
        |put"||'cin'|| '>>'||'sin'||"imp"||imput||
 streams_out: sout|| << || print() || show()

var:                                                       
         

fn >> fn name()


?? () == yes{
         // TEN BLOK KODU 
}
} ??() != no {
         // WYMKNAJ TEN BLOK KODU////////////////////////////////////////

}

 script_loop == yes { 
         // wykonuj blok kodu
} esleif check script_loop != yeas
         break

if{
    // wyświtel warunek spełi


};
