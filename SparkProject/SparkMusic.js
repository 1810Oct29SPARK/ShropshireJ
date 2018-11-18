


function quote(){
    fetch('http://quotes.rest/qod.json')
        .then((response) => {
            console.log(response);
            return response.json();
        })
        .then((data) => {
            console.log(data);
            let  quote = data.contents.quotes;
            let output = '';
            console.log(quote);
            // $.each is a foreach loop in jQuery and takes each array and turns it into its own object 
            $.each(quote,(index,text)=>{
                console.log(text.quote);
                console.log(text.author);
                output +=`
                    <div id="words">
                        <h2 id="words">${text.quote}"</h2>
                        <h4> -${text.author}</h4>
                    </div>                
                `
            })
        $('#quotebox').html(output);  
        })

 }
 
 document.getElementById('quotebutton').addEventListener('click',quote);


