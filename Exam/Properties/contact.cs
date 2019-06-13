namespace Exam.Properties
{
    public class contact
    {
        public string Name
        {
            get => name;
            set => name = value;
        }

        public string Phonenumber
        {
            get => phonenumber;
            set => phonenumber = value;
        }

        private string name;
        private string phonenumber;

        public contact(string name, string phonenumber)
        {
            this.name = name;
            this.phonenumber = phonenumber;
        }
    }
}