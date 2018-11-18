let $= "Where does the Music Live?"
let _= " Click To Enter";
alert($+_);
let E= "The Music Lives Here!!!";
alert(E);


$.getJSON("https://quotesondesign.com/wp-json/posts?filter[orderby]=rand&filter[posts_per_page]=1&callback=", function(a) {
  $("body").append(a[0].content + "<p>&mdash; " + a[0].title + "</p>")
});