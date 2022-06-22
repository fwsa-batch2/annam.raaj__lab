# Problem 1. Given two arrays books and authors, merge them into a single Hash. The keys of the Hash must be the 
# lower-cased firstname of the authors, and must be symbols.

 # fill in code that will create a Hash that looks like:
  #   {
  #     :bruno => "Design as Art",
  #     :neal => "Anathem",
  #     ...
  #   }

  books = ["Design as Art", "Anathem", "Shogun"]
  authors = ["Bruno Munari", "Neal Stephenson", "James Clavell"]
  booksAndAuthors = {}
for i in 0...authors.length do
    author_list = authors[i]
    author_arr = author_list.split(" ")
    author_arr = author_arr[0]
    author_arr = author_arr.downcase
    author_arr = author_arr.to_sym
    books_liist = books[i]
    booksAndAuthors[author_arr] = books_liist
end
puts booksAndAuthors