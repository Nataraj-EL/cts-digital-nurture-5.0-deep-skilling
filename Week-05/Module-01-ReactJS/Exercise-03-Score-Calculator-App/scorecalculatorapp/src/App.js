import { CalculateScore } from './Components/CalculateScore';

function App() {
    return (
        <div>
            <CalculateScore
                Name={"Nataraj"}
                School={"Sri Sairam Matriculation School"}
                total={299}
                goal={3}
            />
        </div>
    );
}

export default App;