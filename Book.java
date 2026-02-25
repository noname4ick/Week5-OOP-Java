public class Book {
        private String title;
        private String author;
        
        public Book(String title,String author){
                this.author = author;
                this.title = title;
        }

        String getTitle(){
                return this.title;
        }
        String getAuthor(){
                return this.author;
        }       
}
