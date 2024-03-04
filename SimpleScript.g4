grammar SimpleScript;

//test warunkowy
tokens {
keyword:

         |'script_start'
         |'script_end'
         |'if'
         |'while'
         |'open'
         |'file'
         |'create'
         | 'add'
         | 'server'
         | 'color'
         | 'lib'
         | 'rev'
         | 'flay'
         | 'inp'|| 'input'|| '>>'
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
         |str
         |num
         |mixed
         |logic
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

}   


if var == yes{
         // warunwk spełniony
} else var == no {
// warunek nie spełnony
}

if script_loop == yes { 
         // wykonuj blok kodu
} esleif check script_loop != yeas
         break

if{
    // wyświtel warunek spełi


};
