public class SignedText{
        private String first;
        private String last;

        public SignedText(String firstName, String lastName){
            this.first = firstName;
            this.last = lastName;
        }

        public String getSignature(){
            if(first.length()==0){
                return last;
            }
            return first.charAt(0) + "-" + last;
        }

        public String addSignature(String texts){
            String s = getSignature();
            int index = texts.indexOf(s);
            if(index == 0){
                return texts.substring(s.length()) + s;
            } else if(index == texts.length()-s.length()){
                return texts;
            } else{
                return text + s;
            }
        }
    }
