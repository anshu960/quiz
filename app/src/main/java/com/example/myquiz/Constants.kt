package com.example.myquiz

object Constants {

    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()
        val que1 = Question(
            1,"What country does this flag belong to?",R.drawable.download,
            "Nisha","Anshu","Ansh","Himanshu",1
        )
        questionsList.add(que1)
        val que2 = Question(
            2,"What country does this flag belong to?",R.drawable.australia,
            "Anshu","Nisha","Ansh","Himanshu",3
        )
        questionsList.add(que2)
        val que3 = Question(
            3,"What country does this flag belong to?",R.drawable.england,
            "Anshu","Nisha","Ansh","Himanshu",3
        )
        questionsList.add(que3)
        val que4 = Question(
            4,"What country does this flag belong to?",R.drawable.india,
            "Anshu","Nisha","Ansh","Himanshu",3
        )
        questionsList.add(que4)
        val que5 = Question(
            5,"What country does this flag belong to?",R.drawable.newzealand,
            "Anshu","Nisha","Ansh","Himanshu",3
        )
        questionsList.add(que5)
        val que6 = Question(
            6,"What country does this flag belong to?",R.drawable.pakistan,
            "Anshu","Nisha","Ansh","Himanshu",3
        )
        questionsList.add(que6)
        val que7 = Question(
            7,"What country does this flag belong to?",R.drawable.unitedstate,
            "Anshu","Nisha","Ansh","Himanshu",3
        )
        questionsList.add(que7)
        val que8 = Question(
            8,"What country does this flag belong to?",R.drawable.sri_lanka,
            "Anshu","Nisha","Ansh","Himanshu",3
        )
        questionsList.add(que8)
        val que9 = Question(
            9,"What country does this flag belong to?",R.drawable.south_africa,
            "Anshu","Nisha","Ansh","Himanshu",3
        )
        questionsList.add(que9)
        val que10 = Question(
            10,"Name this Person",R.drawable.afghanistan,
            "Anshu","Nisha","Ansh","Himanshu",3
        )
        questionsList.add(que10)
        return questionsList
    }
}