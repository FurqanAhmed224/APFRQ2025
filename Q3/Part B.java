public ArrayList<Match> buildMatches(){
        ArrayList<Match> matches = new ArrayList<>();

        int startIndex = 0;
        if(competitorList.size() %2 == 1)
            start index = 1;
        }
        int endIndex = competitorList.size() - 1;
        
        while (startIndex < endIndex){
            mathces.add(new Match(competitorList.get(startIndex), competitorList.get(endIndex)));
            startIndex++;
            endIndex--
        }
        return matches;
    }
